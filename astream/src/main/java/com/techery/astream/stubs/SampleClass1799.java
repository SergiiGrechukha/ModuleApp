package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1799 {

    @Ignore    private SampleClass1800 sampleClass;

    public SampleClass1799(){
        sampleClass = new SampleClass1800();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}