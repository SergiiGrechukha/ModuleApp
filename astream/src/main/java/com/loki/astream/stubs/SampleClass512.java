package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass512 {

    @Ignore    private SampleClass513 sampleClass;

    public SampleClass512(){
        sampleClass = new SampleClass513();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}