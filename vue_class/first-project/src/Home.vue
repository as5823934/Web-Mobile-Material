<template>
<div>
  <name-status v-for="n in 5"></name-status>
</div>
</template>

<script>
import Status from './NameStatus.vue'
export default {
  components: {//can only use this commpoent in this template
    'name-status': Status
  }
}
</script>
