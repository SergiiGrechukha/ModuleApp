package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1276 {

    @Ignore    private SampleClass1277 sampleClass;

    public SampleClass1276(){
        sampleClass = new SampleClass1277();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}