package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass341 {

    @Ignore    private SampleClass342 sampleClass;

    public SampleClass341(){
        sampleClass = new SampleClass342();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}