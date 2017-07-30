package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1424 {

    @Ignore    private SampleClass1425 sampleClass;

    public SampleClass1424(){
        sampleClass = new SampleClass1425();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}