package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass325 {

    @Ignore    private SampleClass326 sampleClass;

    public SampleClass325(){
        sampleClass = new SampleClass326();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}