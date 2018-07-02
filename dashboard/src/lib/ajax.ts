import axios from "axios";
import util from "./util";
import appconst from "./appconst";
import Vue from "vue";
const ajax = axios.create({
  baseURL: appconst.remoteServiceBaseUrl,
  timeout: 30000
});
ajax.interceptors.request.use(
  function (config) {
    if (!!window.abp.auth.getToken()) {
      config.headers.common["Authorization"] = util.getCookieValue();;
      //  config.headers.common["Authorization"] = "awdawdawd";
    }
    //  config.headers.common[".AspNetCore.Culture"]=window.abp.utils.getCookieValue("Abp.Localization.CultureName");
    //  config.headers.common["Abp.TenantId"]=window.abp.multiTenancy.getTenantIdCookie();
    return config;
  },
  function (error) {
    return Promise.reject(error);
  }
);
let vm = new Vue({});
ajax.interceptors.response.use(
  respon => {
    return respon.data;
  },
  error => {
    if (
      !!error.response &&
      !!error.response.data.error &&
      error.response.data.status
    ) {
      vm.$Modal.error({
        title: error.response.data.error,
        content: error.response.data.message
      });
    } else if (
      !!error.response &&
      !!error.response.data.error &&
      !!error.response.data.message
    ) {
      vm.$Modal.error({
        title: "登陆失败",
        content: error.response.data.message
      });
    } else if (!error.response) {
      vm.$Modal.error("位置错误");
    }
    setTimeout(() => {
      vm.$Message.destroy();
    }, 1000);
    return Promise.reject(error);
  }
);
export default ajax;
