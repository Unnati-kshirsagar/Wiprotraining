function separateFirstRest(...args) {
  return { first: args[0], rest: args.slice(1) };
}

console.log(separateFirstRest(10, 20, 30, 40, 50));
