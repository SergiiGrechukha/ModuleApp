package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass447 {

    @Ignore    private SampleClass448 sampleClass;

    public SampleClass447(){
        sampleClass = new SampleClass448();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}