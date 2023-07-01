function DessertsList(props) {
  // Implement the component here.

  const listItems = props.map(dessert =>{
    const dessertName = dessert.name
    const dessertsCalories = dessert.calories
    const itemText = `${dessertName} - ${dessertsCalories} cal`
  })

  return <ul>{itemText}</ul>;
}

export default DessertsList;
