package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1625 {

    @Ignore    private SampleClass1626 sampleClass;

    public SampleClass1625(){
        sampleClass = new SampleClass1626();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}