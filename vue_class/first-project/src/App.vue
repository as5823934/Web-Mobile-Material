<template>
  <div>
    <dp-names></dp-names>
  </div>
</template>

<script>
import Home from './Home.vue'
export default {
  components: {//can only use this commpoent in this template
    'dp-names' : Home
  }
}
</script>
