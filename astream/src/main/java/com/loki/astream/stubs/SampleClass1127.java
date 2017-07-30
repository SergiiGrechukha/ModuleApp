package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1127 {

    @Ignore    private SampleClass1128 sampleClass;

    public SampleClass1127(){
        sampleClass = new SampleClass1128();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}