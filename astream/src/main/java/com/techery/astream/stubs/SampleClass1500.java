package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1500 {

    @Ignore    private SampleClass1501 sampleClass;

    public SampleClass1500(){
        sampleClass = new SampleClass1501();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}