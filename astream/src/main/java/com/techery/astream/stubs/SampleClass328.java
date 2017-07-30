package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass328 {

    @Ignore    private SampleClass329 sampleClass;

    public SampleClass328(){
        sampleClass = new SampleClass329();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}