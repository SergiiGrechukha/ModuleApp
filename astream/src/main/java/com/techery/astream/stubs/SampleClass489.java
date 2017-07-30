package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass489 {

    @Ignore    private SampleClass490 sampleClass;

    public SampleClass489(){
        sampleClass = new SampleClass490();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}