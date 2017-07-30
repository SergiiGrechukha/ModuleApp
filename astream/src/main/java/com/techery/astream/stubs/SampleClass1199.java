package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1199 {

    @Ignore    private SampleClass1200 sampleClass;

    public SampleClass1199(){
        sampleClass = new SampleClass1200();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}