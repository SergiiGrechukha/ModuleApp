package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1997 {

    @Ignore    private SampleClass1998 sampleClass;

    public SampleClass1997(){
        sampleClass = new SampleClass1998();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}