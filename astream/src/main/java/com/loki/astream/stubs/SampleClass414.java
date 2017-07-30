package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass414 {

    @Ignore    private SampleClass415 sampleClass;

    public SampleClass414(){
        sampleClass = new SampleClass415();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}