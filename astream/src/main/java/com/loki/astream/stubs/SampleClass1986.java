package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1986 {

    @Ignore    private SampleClass1987 sampleClass;

    public SampleClass1986(){
        sampleClass = new SampleClass1987();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}