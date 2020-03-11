import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormulairebisComponent } from './formulairebis.component';

describe('FormulairebisComponent', () => {
  let component: FormulairebisComponent;
  let fixture: ComponentFixture<FormulairebisComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormulairebisComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormulairebisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
