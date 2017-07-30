package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass300 {

    @Ignore    private SampleClass301 sampleClass;

    public SampleClass300(){
        sampleClass = new SampleClass301();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}