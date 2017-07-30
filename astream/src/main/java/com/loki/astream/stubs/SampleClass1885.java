package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1885 {

    @Ignore    private SampleClass1886 sampleClass;

    public SampleClass1885(){
        sampleClass = new SampleClass1886();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}