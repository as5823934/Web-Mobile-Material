import Vue from 'vue'
import App from './App.vue'
import Home from './Home.vue'
import Status from './NameStatus.vue'

// Vue.component('name-status', Status) //Global regeister component

new Vue({
  el: '#app',
  render: h => h(App)
})
