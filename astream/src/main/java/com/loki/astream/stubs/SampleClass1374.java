package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1374 {

    @Ignore    private SampleClass1375 sampleClass;

    public SampleClass1374(){
        sampleClass = new SampleClass1375();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}