package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass31 {

    @Ignore    private SampleClass32 sampleClass;

    public SampleClass31(){
        sampleClass = new SampleClass32();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}