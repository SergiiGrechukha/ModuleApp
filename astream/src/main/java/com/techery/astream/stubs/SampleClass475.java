package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass475 {

    @Ignore    private SampleClass476 sampleClass;

    public SampleClass475(){
        sampleClass = new SampleClass476();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}