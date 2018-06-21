<template>
  <div class="col-xs-12 col-sm-6">
        <slot name ="head"></slot>
        <p v-if="!server">Server Details are currently not updated</p>
        <p v-else>Server ID: {{server.id}}, Server Status: {{server.status}}</p>
        <slot name = "sub">This is a default</slot>
        <slot name ="foot"></slot>
  </div>
</template>

<script>
import {serverEventBus} from './main'
export default {
  data(){
    return {
        server: null,
    }
  },
  created(){
    serverEventBus.$on('serverSelected', (data)=>{
      this.server = data;
    });
  }
  
}

</script>

<style scoped>

</style>

