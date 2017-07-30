package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1120 {

    @Ignore    private SampleClass1121 sampleClass;

    public SampleClass1120(){
        sampleClass = new SampleClass1121();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}