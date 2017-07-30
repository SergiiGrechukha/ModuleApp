package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1352 {

    @Ignore    private SampleClass1353 sampleClass;

    public SampleClass1352(){
        sampleClass = new SampleClass1353();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}