package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1409 {

    @Ignore    private SampleClass1410 sampleClass;

    public SampleClass1409(){
        sampleClass = new SampleClass1410();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}