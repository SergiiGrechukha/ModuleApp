package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1373 {

    @Ignore    private SampleClass1374 sampleClass;

    public SampleClass1373(){
        sampleClass = new SampleClass1374();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}