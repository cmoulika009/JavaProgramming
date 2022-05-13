describe('Launch Courses Application', () => {
 beforeEach(() => {
  cy.visit('http://localhost:4200');
});

it('Launch Courses', () => {
    cy.contains('Get Courses').click()
    cy.contains('Add Course').click()
  })
});

describe('Get Courses Test', () => {
 beforeEach(() => {
  cy.visit('http://localhost:4200/getCourses');
});

it('Get Courses', () => {
  cy.get('table').contains('th', 'Course ID')
  cy.get('th').eq(2).should('contain', 'Course Description')
  cy.get('td').eq(1).should('contain', 'Java')
  })
});

describe('Add Courses Test', () => {
 beforeEach(() => {
  cy.visit('http://localhost:4200/addCourse');
});

it('Add Courses',()=>{
  cy.contains('Course Name')

  cy.get('input[id="courseName"]').type('Pact')
  .should("have.value", "Pact")

  cy.get('input[id="courseDescription"]')
  .type('Consumer-driven contract tests are a technique to test integration points between API providers and API consumers without the hassle of end-to-end tests')
  .should("have.value","Consumer-driven contract tests are a technique to test integration points between API providers and API consumers without the hassle of end-to-end tests")

  cy.get("form").submit();

  cy.contains("Success!");

  cy.contains('Get Courses').click()
})
});
