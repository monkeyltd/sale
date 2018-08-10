import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)
import {
	request
} from "../common/ajax.js"
const store = new Vuex.Store({
	state: {
		tenantName: "default",
		deviceCode:"xc-001",
		products: [],
		totalCount:0
	},
	mutations: {
		setPageSize(state, size) {
			state.pageSize = size;
		}
	},
	actions: {
		//获取所有
		async loadMore({
			state
		}, payload) {
			request('/api/device/products', "POST",payload , function (r) {
				if(payload.init){
					state.products=[];
				}
				state.products.push(...r.data.data.records);
				state.totalCount = r.data.data.total;
			});
		}
	},
	modules: {}
})

export default store