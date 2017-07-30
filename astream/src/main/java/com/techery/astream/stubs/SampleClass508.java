package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass508 {

    @Ignore    private SampleClass509 sampleClass;

    public SampleClass508(){
        sampleClass = new SampleClass509();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}