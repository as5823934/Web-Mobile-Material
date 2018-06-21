
<template>
    <!-- <ul class="list-group"> -->
        <li class="list-group-item"
            style="cursor: pointer"
            @click ="displaySelectedServer()">
            Server #{{ server.id }}
        </li>
    <!-- </ul> -->
    </template>

<script>
import {serverEventBus} from './main'
export default {
  props:['server'],
//   props: {
//       server:{
//           type: Object,
//           required: true,
//       }
//   },
  methods: {
      displaySelectedServer(){
          //this.$emit('onServerSelected', this.server);
          serverEventBus.$emit('serverSelected', this.server);
      }
  }
}
</script>




