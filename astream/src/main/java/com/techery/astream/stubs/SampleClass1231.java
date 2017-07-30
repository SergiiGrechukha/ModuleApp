package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1231 {

    @Ignore    private SampleClass1232 sampleClass;

    public SampleClass1231(){
        sampleClass = new SampleClass1232();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}