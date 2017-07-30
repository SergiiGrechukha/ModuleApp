package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass657 {

    @Ignore    private SampleClass658 sampleClass;

    public SampleClass657(){
        sampleClass = new SampleClass658();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}