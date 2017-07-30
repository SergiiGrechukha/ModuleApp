package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1375 {

    @Ignore    private SampleClass1376 sampleClass;

    public SampleClass1375(){
        sampleClass = new SampleClass1376();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}