package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass129 {

    @Ignore    private SampleClass130 sampleClass;

    public SampleClass129(){
        sampleClass = new SampleClass130();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}