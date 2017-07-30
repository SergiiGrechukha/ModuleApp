package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass171 {

    @Ignore    private SampleClass172 sampleClass;

    public SampleClass171(){
        sampleClass = new SampleClass172();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}