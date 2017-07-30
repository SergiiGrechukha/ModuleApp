package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass134 {

    @Ignore    private SampleClass135 sampleClass;

    public SampleClass134(){
        sampleClass = new SampleClass135();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}