package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass560 {

    @Ignore    private SampleClass561 sampleClass;

    public SampleClass560(){
        sampleClass = new SampleClass561();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}