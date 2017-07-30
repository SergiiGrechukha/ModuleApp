package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1176 {

    @Ignore    private SampleClass1177 sampleClass;

    public SampleClass1176(){
        sampleClass = new SampleClass1177();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}