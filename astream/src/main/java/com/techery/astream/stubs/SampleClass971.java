package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass971 {

    @Ignore    private SampleClass972 sampleClass;

    public SampleClass971(){
        sampleClass = new SampleClass972();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}