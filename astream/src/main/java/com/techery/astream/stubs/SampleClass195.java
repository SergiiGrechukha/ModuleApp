package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass195 {

    @Ignore    private SampleClass196 sampleClass;

    public SampleClass195(){
        sampleClass = new SampleClass196();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}