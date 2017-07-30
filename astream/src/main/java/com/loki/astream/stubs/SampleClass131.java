package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass131 {

    @Ignore    private SampleClass132 sampleClass;

    public SampleClass131(){
        sampleClass = new SampleClass132();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}