import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExplabComponent } from './explab.component';

describe('ExplabComponent', () => {
  let component: ExplabComponent;
  let fixture: ComponentFixture<ExplabComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExplabComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExplabComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
