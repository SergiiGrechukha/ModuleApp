package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1315 {

    @Ignore    private SampleClass1316 sampleClass;

    public SampleClass1315(){
        sampleClass = new SampleClass1316();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}