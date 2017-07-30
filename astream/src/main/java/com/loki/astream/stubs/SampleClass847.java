package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass847 {

    @Ignore    private SampleClass848 sampleClass;

    public SampleClass847(){
        sampleClass = new SampleClass848();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}