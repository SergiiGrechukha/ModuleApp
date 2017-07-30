package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass488 {

    @Ignore    private SampleClass489 sampleClass;

    public SampleClass488(){
        sampleClass = new SampleClass489();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}