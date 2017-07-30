package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1013 {

    @Ignore    private SampleClass1014 sampleClass;

    public SampleClass1013(){
        sampleClass = new SampleClass1014();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}