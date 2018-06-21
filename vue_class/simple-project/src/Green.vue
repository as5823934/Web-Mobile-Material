<template>
  <div>
      <slot></slot>
  </div>
</template>

<script>
export default {
  destroyed() {
      alert("Component destroyed!");
  }
}
</script>
<style scoped>

</style>


