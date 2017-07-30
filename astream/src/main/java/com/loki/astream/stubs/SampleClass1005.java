package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1005 {

    @Ignore    private SampleClass1006 sampleClass;

    public SampleClass1005(){
        sampleClass = new SampleClass1006();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}